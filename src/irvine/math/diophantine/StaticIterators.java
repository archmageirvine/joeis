package irvine.math.diophantine;

import irvine.math.z.Z;
import irvine.util.AbstractIterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Iterators used by more than Diophantine solver.
 *
 * @author Sean A. Irvine
 */
public final class StaticIterators {

  private StaticIterators() { }

  /** Iterator to return when there are no possible solutions. */
  public static final Iterator<List<Z>> NO_SOLUTION = new AbstractIterator<List<Z>>() {
    @Override
    public boolean hasNext() {
      return false;
    }
    @Override
    public List<Z> next() {
      throw new NoSuchElementException();
    }
  };

}
