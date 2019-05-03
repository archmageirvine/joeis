package irvine.oeis.a019;

/**
 * A019595 From George Gilbert's marks problem: jumping 4 marks at a time (initial positions).
 * @author Sean A. Irvine
 */
public class A019595 extends A019592 {

  @Override
  protected long step(final long position) {
    return mNextPosition.get(super.step(position));
  }
}
