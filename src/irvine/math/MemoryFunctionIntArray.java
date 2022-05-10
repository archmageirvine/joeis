package irvine.math;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Definition of a function of a list that remembers previously computed results.
 * @author Georg Fischer
 * @param <R> result type
 */
public abstract class MemoryFunctionIntArray<R> extends HashMap<String, R> {

  /**
   * Empty constructor.
   * Allocate a HashMap with rather big chunks.
   */ 
  public MemoryFunctionIntArray() {
   super(16384);
  }

  /**
   * Compute the function at specified parameters.
   * @param c array of int parameters
   * @return value of function
   */
  protected abstract R compute(final int[] c);

  /**
   * Return the value of the function at specified parameters.
   * @param list an int[] array
   * @return value of function
   */
  public R get(final int[] list) {
    final String key = getKey(list);
    final R res = get(key);
    if (res != null) {
      return res;
    }
    final R r = compute(list);
    put(key, r);
    return r;
  }

  /**
   * Build the key String.
   * Usable for test printouts.
   * @param list an int[] array
   * @return "[0,1,2]" for example
   */
  protected String getKey(final int[] list) {
    return Arrays.toString(list);
  }
}
