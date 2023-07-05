package irvine.oeis.a335;

import irvine.math.z.Z;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a097.A097945;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A335032 Dirichlet g.f.: zeta(s) * zeta(s-1) * Product_{p prime} (1 + p^(1 - s) - p^(-s)).
 * @author Georg Fischer
 */
public class A335032 extends DirichletConvolutionSequence {

  /** Construct the sequence. */
  public A335032() {
    super(new A000203(), 1, new SimpleTransformSequence(new A097945(), Z::abs), 1);
  }
}
