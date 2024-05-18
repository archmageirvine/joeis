package irvine.oeis.a069;

import irvine.oeis.Combiner;
import irvine.oeis.PrependSequence;
import irvine.oeis.a003.A003645;

/**
 * A069732 Number of nonisomorphic unrooted unicursal planar maps with n edges and no vertices of valency 1 (unicursal means that exactly two vertices are of odd valency; there is an Eulerian path).
 * @author Sean A. Irvine
 */
public class A069732 extends Combiner {

  /** Construct the sequence. */
  public A069732() {
    super(1, new Combiner(new A069724(), new A069725(), SUBTRACT), new PrependSequence(new A003645(), 0), SUBTRACT);
  }
}

