package irvine.oeis.a389;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a080.A080259;
import irvine.oeis.a383.A383394;

/**
 * A389341 Powers k^m, m &gt; 1, where k is an Achilles number such that A053669(k) &lt; A006530(k).
 * @author Sean A. Irvine
 */
public class A389341 extends IntersectionSequence {

  /** Construct the sequence. */
  public A389341() {
    super(1, new A383394(), new A080259());
  }
}
