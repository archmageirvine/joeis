package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104679 <code>a(n) =</code> C(n+5,5)*C(n+10,5).
 * @author Sean A. Irvine
 */
public class A104679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104679() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {252, 2772, 16632, 72072, 252252, 756756, 2018016, 4900896, 11027016, 23279256, 46558512});
  }
}
