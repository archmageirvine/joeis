package irvine.oeis.a153;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A153179 <code>a(n) = L(11*n)/L(n)</code> where <code>L(n) = A000204(n)</code>.
 * @author Sean A. Irvine
 */
public class A153179 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153179() {
    super(new long[] {-1, 89, 4895, -83215, -582505, 1514513, 1514513, -582505, -83215, 4895, 89},
      new Z[] {Z.valueOf(199), Z.valueOf(13201), Z.valueOf(1970299), Z.valueOf(224056801), Z.valueOf(28374454999L), Z.valueOf(3450736132801L), Z.valueOf(426236170575799L), Z.valueOf(52337681992411201L), Z.valueOf(6441140796368008699L), new Z("792018481913198430001"), new Z("97420733208491869044199")});
  }
}
