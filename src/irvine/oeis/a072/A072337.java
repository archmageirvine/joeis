package irvine.oeis.a072;
// manually eulerxm/eulerix 0 at 2022-04-15 11:37

import irvine.oeis.a064.A064831;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A072337 Inverse EULER transform of A064831 (with its initial 1 omitted).
 * @author Georg Fischer
 */
public class A072337 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A072337() {
    super(new A064831(), 2, 1);
  }
}
