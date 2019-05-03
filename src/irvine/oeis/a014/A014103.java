package irvine.oeis.a014;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A014103 Expansion of <code>(eta(q^2) / eta(q))^24</code> in powers of q.
 * @author Sean A. Irvine
 */
public class A014103 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A014103() {
    super(new PeriodicSequence(24, 0), 0);
  }
}
