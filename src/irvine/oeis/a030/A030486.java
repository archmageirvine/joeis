package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030486 When squared gives number composed of digits {2,5,6}.
 * @author Sean A. Irvine
 */
public class A030486 extends A030484 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
