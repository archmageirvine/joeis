package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000578;

/**
 * A061460 Cubes which produce cubes when the leading digit is moved to the end.
 * @author Sean A. Irvine
 */
public class A061460 extends A000578 {

  /** Construct the sequence. */
  public A061460() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final String s = t.toString();
      if (ZUtils.isCube(new Z(s.substring(1) + s.charAt(0)))) {
        return t;
      }
    }
  }
}

