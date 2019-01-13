package irvine.math;

import java.util.Random;

/**
 * Fair shuffling of a given number of items.
 * @author Sean A. Irvine
 */
public final class Shuffle {

  private Shuffle() { }

  private static final Random RANDOM = new Random();

  /**
   * Produce a random shuffle on the integers from 0 to <code>n-1</code>.
   *
   * @param n size of array
   * @return shuffle
   */
  public static int[] shuffle(final int n) {
    final int[] t = new int[n];
    for (int k = 0; k < n; ++k) {
      t[k] = k;
    }
    for (int j = 0; j < t.length; ++j) {
      final int z = RANDOM.nextInt(t.length - j);
      final int u = t[j + z];
      t[j + z] = t[j];
      t[j] = u;
    }
    return t;
  }

  /**
   * Shuffle an array.
   * @param t array
   * @param random underlying random source
   * @param <T> type of array
   */
  public static <T> void shuffle(final T[] t, final Random random) {
    for (int j = 0; j < t.length; ++j) {
      final int z = random.nextInt(t.length - j);
      final T u = t[j + z];
      t[j + z] = t[j];
      t[j] = u;
    }
  }

  /**
   * Shuffle an array.
   * @param t array
   * @param <T> type of array
   */
  public static <T> void shuffle(final T[] t) {
    shuffle(t, RANDOM);
  }

  /**
   * Shuffle a character array.
   * @param t array
   * @param random underlying random source
   */
  public static void shuffle(final char[] t, final Random random) {
    for (int j = 0; j < t.length; ++j) {
      final int z = random.nextInt(t.length - j);
      final char u = t[j + z];
      t[j + z] = t[j];
      t[j] = u;
    }
  }

  /**
   * Shuffle a character array.
   * @param t array
   */
  public static void shuffle(final char[] t) {
    shuffle(t, RANDOM);
  }

  /**
   * Print a shuffle of specified number of elements.
   *
   * @param args number of items
   */
  public static void main(final String[] args) {
    for (final int v : shuffle(Integer.parseInt(args[0]))) {
      System.out.println(String.valueOf(v));
    }
  }
}
