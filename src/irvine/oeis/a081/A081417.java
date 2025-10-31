package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.oeis.a007.A007318;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A081417 A000720 applied to Pascal-triangle: primepi(C(n,j)), j,0..n and n=0,1,2,...
 * @author Sean A. Irvine
 */
public class A081417 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A081417() {
    super(0, new A007318(), Functions.PRIME_PI::z);
  }
}

