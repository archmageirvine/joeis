package irvine.oeis.a113;
// Generated by gen_seq4.pl insect/insect2 at 2022-02-25 17:33

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a020.A020477;
import irvine.oeis.a039.A039771;

/**
 * A113939 Numbers k such that sigma(k) and phi(k) are both perfect cubes.
 * @author Georg Fischer
 */
public class A113939 extends IntersectionSequence {

  /** Construct the sequence. */
  public A113939() {
    super(new A020477(), new A039771());
  }
}
