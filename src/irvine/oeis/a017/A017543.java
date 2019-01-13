package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A017543.
 * @author Sean A. Irvine
 */
public class A017543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017543() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12},
      new Z[] {
        Z.ONE,
        Z.valueOf(1792160394037L),
        Z.valueOf(2384185791015625L),
        Z.valueOf(177917621779460413L),
        Z.valueOf(3909821048582988049L),
        new Z("43513917611435838661"),
        new Z("313726685568359708377"),
        new Z("1673432436896142578125"),
        new Z("7153014030880804126753"),
        new Z("25804264053054077850709"),
        new Z("81402749386839761113321"),
        new Z("230339304218442143770717")
      });
  }
}
