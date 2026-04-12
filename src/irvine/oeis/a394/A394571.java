package irvine.oeis.a394;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a047.A047845;
import irvine.oeis.a094.A094550;

/**
 * A394571 Positive integers k such that (2*k)^m + 1 is composite for every m &gt;= 1 that is not a power of 2 with value &gt;= 4.
 * @author Sean A. Irvine
 */
public class A394571 extends IntersectionSequence {

  /** Construct the sequence. */
  public A394571() {
    super(new A094550(), new A047845());
  }
}
