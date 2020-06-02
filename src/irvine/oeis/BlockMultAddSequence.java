package irvine.oeis;

import irvine.math.z.Z;

/**
 * A sequence calculated by a sequence of add and multiply operations, for example 
 * A319887 a(n) = 4*3*2*1 - 8*7*6*5 + 12*11*10*9 - 16*15*14*13 + ... - (up to the n-th term).
 * @author Georg Fischer
 */
public class BlockMultAddSequence implements Sequence {

  protected final int mBlockLen; // length of the blocks
  protected int mBlockIndex; // iterates over the numbers in a block
  protected final String mOper; // pattern for the operations
  protected final int mOperLen; // length of mOper
  protected int mK; // k * mBlockLen, k = 0,1,2,...
  protected int mI; // between 1 and mBlockLen, upwards or downwards
  protected Z mTerm; // current product for a block
  protected Z mSum; // sum of complete blocks so far

  /**
   * Creates a new Add/Multiply sequence.
   *
   * @param blockLen number of factors in a block
   * @param oper String of operations containing '&lt;', '&gt;', '+' and '-'
   */
  public BlockMultAddSequence(final int blockLen, final String oper) {
    mBlockLen = blockLen;
    mBlockIndex = 0;
    mOper = oper;
    mOperLen = mOper.length();
    mK = 0;
    mI = mK * mBlockLen + (mOper.startsWith("<") ? 1 : mBlockLen);
    mSum  = Z.ZERO;
    mTerm = Z.ONE; // first term is always positive
  }

  @Override
  public Z next() {
    Z result = null;
    boolean busy = true;
    while (busy) {
      final char op = mOper.charAt(mBlockIndex++);
      mBlockIndex %= mOperLen;
      busy = false; // assume we are finished
      if (op == '<') {
        mTerm = mTerm.multiply(Z.valueOf(mI));
        ++mI;
        result = mSum.add(mTerm);
      } else if (op == '>') {
        mTerm = mTerm.multiply(Z.valueOf(mI));
        --mI;
        result = mSum.add(mTerm);
      } else if (op == '+') {
        mSum = mSum.add(mTerm);
        mTerm = Z.ONE;
        ++mK;
        mI = mK * mBlockLen + (mOper.startsWith("<") ? 1 : mBlockLen);
        busy = true; // retry
      } else if (op == '-') {
        mSum = mSum.add(mTerm);
        mTerm = Z.NEG_ONE;
        ++mK;
        mI = mK * mBlockLen + (mOper.startsWith("<") ? 1 : mBlockLen);
        busy = true; // retry
      }
    } // while busy
    return result;
  }

  /**
   * Run the add/mult sequence with the parameters on the command line
   * @param args <code>blockLen, oper</code>
   */
  public static void main(final String[] args) {
    final int blockLen = args.length > 0 ? Integer.parseInt(args[0]) : 3;
    final String oper = args.length > 1 ? args[1] : ">>>->>>+";
    final BlockMultAddSequence seq = new BlockMultAddSequence(blockLen, oper);
    Z a;
    int n = 0;
    System.out.println("# irvine.oeis.BlockMultAddSequence " + blockLen + " \"" + oper + "\"");
    while ((a = seq.next()) != null && n < 1000) {
      ++n;
      System.out.println(n + " " + a);
    }
  }
}
