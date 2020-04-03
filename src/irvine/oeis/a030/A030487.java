package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030487 When squared gives number composed of digits <code>{2, 5, 7}</code>.
 * @author Sean A. Irvine
 */
public class A030487 extends A030485 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
