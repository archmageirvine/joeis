package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A004072 Read the terms of A004071 backwards.
 * @author Sean A. Irvine
 */
public class A004072 extends A004071 {

  @Override
  public Z next() {
    return Functions.REVERSE.z(super.next());
  }

}
