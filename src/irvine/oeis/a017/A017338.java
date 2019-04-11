package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A017338 <code>a(n) = (10*n + 5)^10</code>.
 * @author Sean A. Irvine
 */
public class A017338 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017338() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {Z.valueOf(9765625), Z.valueOf(576650390625L), Z.valueOf(95367431640625L), Z.valueOf(2758547353515625L), Z.valueOf(34050628916015625L), Z.valueOf(253295162119140625L), Z.valueOf(1346274334462890625L), Z.valueOf(5631351470947265625L), new Z("19687440434072265625"), new Z("59873693923837890625"), new Z("162889462677744140625")});
  }
}
