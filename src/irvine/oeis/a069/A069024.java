package irvine.oeis.a069;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a057.A057890;
import irvine.oeis.a061.A061917;

/**
 * A069003.
 * @author Sean A. Irvine
 */
public class A069024 extends IntersectionSequence {

  /** Construct the sequence. */
  public A069024() {
    super(1, new A061917(), new A057890());
  }
}

