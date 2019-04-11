package irvine.oeis.a009;

/**
 * A009331 If <code>a, b</code> in sequence, so is <code>ab+8</code>.
 * @author Sean A. Irvine
 */
public class A009331 extends A009293 {

  @Override
  protected long add() {
    return 8;
  }
}
