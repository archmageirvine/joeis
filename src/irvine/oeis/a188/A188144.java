package irvine.oeis.a188;

import irvine.oeis.a005.A005425;
import irvine.oeis.transform.InverseInvertTransform;

/**
 * A188144 Binomial transform A140456(n+1) (indecomposable involutions).
 * @author Georg Fischer
 */
public class A188144 extends InverseInvertTransform {

  /** Construct the sequence. */
  public A188144() {
    super(0, new A005425(), 1);
    next();
  }
}
