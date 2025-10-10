package irvine.oeis.a378;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a025.A025487;
import irvine.oeis.a052.A052486;

/**
 * A378002 Achilles numbers that are products of primorials.
 * @author Sean A. Irvine
 */
public class A378002 extends IntersectionSequence {

  /** Construct the sequence. */
  public A378002() {
    super(1, new A052486(), new A025487());
  }
}
