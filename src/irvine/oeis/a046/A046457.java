package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A046457 Concatenation of the 8 prime factors of composite a(n) is a palindrome.
 * @author Sean A. Irvine
 */
public class A046457 extends AbstractSequence {

  private final A046447 mSeq1 = new A046447();

  /** Construct the sequence. */
  public A046457() {
    super(0);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mSeq1.next();
      if (Jaguar.factor(t).bigOmega() == 8) {
        return t;
      }
    }
  }
}
