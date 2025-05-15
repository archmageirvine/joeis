package irvine.oeis.a383;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a022.A022544;
import irvine.oeis.a034.A034020;

/**
 * A383785 allocated for C. S. Davis.
 * @author Sean A. Irvine
 */
public class A383785 extends IntersectionSequence {

  /** Construct the sequence. */
  public A383785() {
    super(1, new A022544(), new A034020());
  }
}
