package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A046454 Concatenation of the 5 prime factors of composite a(n) is a palindrome.
 * @author Sean A. Irvine
 */
public class A046454 extends AbstractSequence {

  private final A046447 mSeq1 = new A046447();

  /** Construct the sequence. */
  public A046454() {
    super(0);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mSeq1.next();
      if (Functions.BIG_OMEGA.l(t) == 5) {
        return t;
      }
    }
  }
}
