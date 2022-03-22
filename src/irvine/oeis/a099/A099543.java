package irvine.oeis.a099;

import irvine.math.z.Z;

/**
 * A099543 Sums of the prime factors of the Rhonda numbers to base 10 (sequence A099542). The terms in this sequence are equal to (Product of digits of terms of A099542)/10, which is simply the definition of Rhonda numbers to base 10.
 * The terms in this sequence are equal to (Product of digits of terms of A099542)/10,
 * which is simply the definition of Rhonda numbers to base 10.
 * @author Georg Fischer
 */
public class A099543 extends A099542 {

  @Override
  public Z next() {
    super.next();
    return super.mSopfr;
  }
}
