package irvine.oeis.a009;

/**
 * A009307 If <code>a, b</code> in sequence, so is <code>ab+6</code>.
 * @author Sean A. Irvine
 */
public class A009307 extends A009293 {

  @Override
  protected long add() {
    return 6;
  }
}
