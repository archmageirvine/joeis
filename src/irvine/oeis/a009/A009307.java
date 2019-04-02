package irvine.oeis.a009;

/**
 * A009307 If a, b in sequence, so is ab+6.
 * @author Sean A. Irvine
 */
public class A009307 extends A009293 {

  @Override
  protected long add() {
    return 6;
  }
}
