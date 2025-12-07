package irvine.oeis.a390;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a332.A332785;
import irvine.oeis.a375.A375055;

/**
 * A390949 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A390949 extends IntersectionSequence {

  /** Construct the sequence. */
  public A390949() {
    super(1, new A375055(), new A332785());
  }
}
