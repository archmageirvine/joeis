package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030486 When squared gives number composed of digits <code>{2,5,6}</code>.
 * @author Sean A. Irvine
 */
public class A030486 extends A030484 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
