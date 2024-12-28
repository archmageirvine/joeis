package irvine.oeis.a377;

import irvine.math.z.Z;
import irvine.oeis.a255.A255978;

/**
 * A377368 a(n) = A255978(n) + 1.
 * @author Sean A. Irvine
 */
public class A377368 extends A255978 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
