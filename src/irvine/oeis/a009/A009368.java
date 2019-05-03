package irvine.oeis.a009;

/**
 * A009368 If a, b in sequence, so is <code>ab+10</code>.
 * @author Sean A. Irvine
 */
public class A009368 extends A009293 {

  @Override
  protected long add() {
    return 10;
  }
}
