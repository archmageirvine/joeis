package irvine.oeis.a064;

import irvine.oeis.a000.A000108;
import irvine.oeis.transform.Stirling2TransformSequence;

/**
 * A064856 Stirling transform of Catalan numbers: a(n) = Sum_{k=0..n} stirling2(n,k)*binomial(2*k,k)/(k+1).
 * @author Sean A. Irvine
 */
public class A064856 extends Stirling2TransformSequence {

  /** Construct the sequence. */
  public A064856() {
    super(0, new A000108(), 0);
  }
}

