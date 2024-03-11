package irvine.oeis.a121;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A121805 The "comma sequence": the lexicographically earliest sequence of positive numbers with the property that the sequence formed by the pairs of digits adjacent to the commas between the terms is the same as the sequence of successive differences between the terms.
 * @author Georg Fischer
 */
public class A121805 extends AbstractSequence {

  private Z mA;

  /** Construct the sequence. */
  public A121805() {
    this(1, 1);
  }

  protected A121805(final int offset, final int start) {
    super(offset);
    mA = Z.valueOf(start);
  }

  /* Mathematica:
    a[1] = 1; a[n_] := a[n] = For[x=Mod[a[n-1], 10]; y=0, y <= 9, y++, an = a[n-1] + 10*x + y; If[y == IntegerDigits[an][[1]], Return[an]]]; Array[a, 45] 
  */
  @Override
  public Z next() {
    final Z result = mA;
    final long x10 = mA.mod(10) * 10L;
    long y = 0;
    boolean busy = true;
    while (busy && y <= 9L) {
      final Z an = mA.add(x10 + y);
      if (y == an.toString().charAt(0) - '0') {
        mA = an;
        busy = false;
      }
      ++y;
    }
//    if (busy) {
//      System.err.println("** A121805: no y found");
//    }
    return result;
  }
}
