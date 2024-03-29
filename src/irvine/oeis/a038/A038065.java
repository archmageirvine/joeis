package irvine.oeis.a038;
// generated by patch_offset.pl at 2023-02-08 12:41

import irvine.oeis.a274.A274981;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A038065 Product_{k&gt;=1} 1/(1 - x^k)^a(k) = 1 + 4x.
 * @author Georg Fischer
 */
public class A038065 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A038065() {
    super(1, new A274981(), 1);
    next();
  }
}
