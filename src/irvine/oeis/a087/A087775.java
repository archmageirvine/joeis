package irvine.oeis.a087;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A087775 a[1] = 1, a[2] = 2, a[3] = 2; a[n] = 3*a[abs[a[n-2]]] - 3*a[n-abs[a[n-2]]] + a[n-3].
 * @author Georg Fischer
 */
public class A087775 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A087775() {
    super(1, "[0,1,0,0,-2,0,0,1]", "1,2,2,1,2,-1", 0);
  }
}
