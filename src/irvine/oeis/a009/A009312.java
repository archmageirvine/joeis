package irvine.oeis.a009;

/**
 * A009312 If a, b in sequence, so is ab+7.
 * @author Sean A. Irvine
 */
public class A009312 extends A009293 {

  @Override
  protected long add() {
    return 7;
  }
}
