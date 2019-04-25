package irvine.oeis.a012;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a027.A027861;

/**
 * A012132 Numbers z such that <code>x*(x+1) + y*(y+1) = z*(z+1)</code> is solvable in positive integers <code>x,y</code>.
 * @author Sean A. Irvine
 */
public class A012132 extends ComplementSequence {

  /** Construct the sequence. */
  public A012132() {
    super(new A027861(), Z.ONE);
  }
}
