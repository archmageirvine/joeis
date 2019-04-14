package irvine.oeis.a019;

/**
 * A019993 From George Gilbert's marks problem: jumping 5 marks at a time (initial positions).
 * @author Sean A. Irvine
 */
public class A019993 extends A019595 {

  @Override
  protected long step(final long position) {
    return mNextPosition.get(super.step(position));
  }
}
