package irvine.oeis.a185;
// Generated by gen_seq4.pl 2024-06-14/eultra1  at 2024-06-14 23:07

import irvine.oeis.a014.A014371;
import irvine.oeis.transform.EulerTransform;

/**
 * A185334 Number of not necessarily connected 3-regular simple graphs on 2n vertices with girth at least 4.
 * @author Georg Fischer
 */
public class A185334 extends EulerTransform {

  /** Construct the sequence. */
  public A185334() {
    super(0, new A014371().skip(1), 1);
  }
}
