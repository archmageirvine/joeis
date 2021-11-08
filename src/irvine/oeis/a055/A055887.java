package irvine.oeis.a055;

import irvine.oeis.EulerTransform;
import irvine.oeis.a095.A095975;

/**
 * A055887 Number of ordered partitions of partitions.
 *
 * @author Georg Fischer
 */
public class A055887 extends EulerTransform {

  /** Construct the sequence. */
  public A055887() {
    super(new A095975(), 1);
  }
}
