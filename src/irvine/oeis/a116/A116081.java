package irvine.oeis.a116;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A116081 Final nonzero digit of n^n.
 * @author Georg Fischer
 */
public class A116081 extends AbstractSequence {

  protected long mN;
  protected int mBase;

  /** Construct the sequence. */
  public A116081() {
    this(1, 10);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param base of the representation of <code>mN</code>
   */
  public A116081(final int offset, final int base) {
    super(offset);
    mN = offset - 1;
    mBase = base;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0L) {
      return Z.ONE;
    }
    final String nstr = Z.valueOf(mN).pow(mN).toString(mBase);
    int pos = nstr.length() - 1;
    char ch;
    while ((ch = nstr.charAt(pos)) == '0') {
      --pos;
    }
    return Z.valueOf(ch > '9' ? ch - 'a' + 10 : ch - '0');
  }
}
