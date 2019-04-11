package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A017146 <code>a(n) = (8*n+6)^10</code>.
 * @author Sean A. Irvine
 */
public class A017146 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017146() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {Z.valueOf(60466176), Z.valueOf(289254654976L), Z.valueOf(26559922791424L), Z.valueOf(590490000000000L), Z.valueOf(6278211847988224L), Z.valueOf(42420747482776576L), Z.valueOf(210832519264920576L), Z.valueOf(839299365868340224L), Z.valueOf(2824752490000000000L), Z.valueOf(8335775831236199424L), new Z("22130157888803070976")});
  }
}
