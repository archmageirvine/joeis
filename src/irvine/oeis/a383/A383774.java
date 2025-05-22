package irvine.oeis.a383;

import irvine.oeis.Combiner;
import irvine.oeis.a052.A052182;
import irvine.oeis.a085.A085719;

/**
 * A383774 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A383774 extends Combiner {

  /** Construct the sequence. */
  public A383774() {
    super(1, new A052182(), new A085719().skip(), (det, perm) -> det.add(perm).divide2());
  }
}
