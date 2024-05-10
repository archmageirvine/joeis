package irvine.oeis.a070;

import irvine.oeis.a002.A002487;
import irvine.oeis.transform.LittleHankelTransform;

/**
 * A070949 Little Hankel transform of A002487.
 * @author Georg Fischer
 */
public class A070949 extends LittleHankelTransform {

  /** Construct the sequence. */
  public A070949() {
    super(0, new A002487());
    next();
  }
}
