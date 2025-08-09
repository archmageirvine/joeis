package irvine.math.series;

/**
 * Partial implementation of a series known to be infinite.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
public abstract class AbstractInfiniteSeries<E> implements Series<E> {

  @Override
  public int bound() {
    return Integer.MAX_VALUE;
  }
}
