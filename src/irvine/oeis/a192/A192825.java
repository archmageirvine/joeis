package irvine.oeis.a192;
// Generated by gen_seq4.pl insect/insect2 at 2022-02-22 19:20

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a011.A011540;
import irvine.oeis.a038.A038365;

/**
 * A192825 Numbers m containing in decimal representation at least one zero and having no common digit in m and 2*m.
 * @author Georg Fischer
 */
public class A192825 extends IntersectionSequence {

  /** Construct the sequence. */
  public A192825() {
    super(new A011540(), new A038365());
  }
}
