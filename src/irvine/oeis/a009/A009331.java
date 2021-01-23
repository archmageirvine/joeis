package irvine.oeis.a009;

/**
 * A009331 If a, b in sequence, so is ab+8.
 * @author Sean A. Irvine
 */
public class A009331 extends A009293 {

  @Override
  protected long add() {
    return 8;
  }
}
