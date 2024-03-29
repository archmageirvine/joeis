package irvine.oeis.a155;
// Generated by gen_seq4.pl insect/insect2 at 2022-02-24 19:57

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a001.A001481;
import irvine.oeis.a020.A020670;

/**
 * A155568 Intersection of A001481 inter A020670: N = a^2 + b^2 = c^2 + 7d^2 for some integers a,b,c,d.
 * @author Georg Fischer
 */
public class A155568 extends IntersectionSequence {

  /** Construct the sequence. */
  public A155568() {
    super(new A001481(), new A020670());
  }
}
