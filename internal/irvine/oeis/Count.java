package irvine.oeis;

/**
 * Count sequences with offsets.
 * @author Sean A. Irvine
 */
public final class Count {

  private Count() { }

  /**
   * Main program.
   * @param args ignored
   */
  public static void main(final String[] args) {
    long cnt = 0;
    for (int a = 0; a < 370000; ++a) {
      try {
        final Sequence seq = SequenceFactory.sequence("A" + a);
        if (seq instanceof SequenceWithOffset) {
          ++cnt;
        }
      } catch (final UnsupportedOperationException e) {
        // too bad
      }
    }
    System.out.println(cnt);
  }
}

