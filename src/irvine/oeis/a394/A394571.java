package irvine.oeis.a394;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a047.A047845;
import irvine.oeis.a094.A094550;

/**
 * A394571 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A394571 extends IntersectionSequence {

  /** Construct the sequence. */
  public A394571() {
    super(new A094550(), new A047845());
  }
}
