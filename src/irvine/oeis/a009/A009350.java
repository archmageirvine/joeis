package irvine.oeis.a009;

/**
 * A009350 If a, b in sequence, so is <code>ab+9</code>.
 * @author Sean A. Irvine
 */
public class A009350 extends A009293 {

  @Override
  protected long add() {
    return 9;
  }
}
