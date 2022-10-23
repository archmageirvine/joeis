package irvine.oeis.a030;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.Chinese;

/**
 * A030166 Number of strokes in Chinese characters for n; also number of strokes in Japanese kanji characters for n.
 * @author Sean A. Irvine
 */
public class A030166 extends Sequence0 {

  private static final HashMap<Character, Integer> STROKES = new HashMap<>();
  static {
    STROKES.put('\u96f6', 13);
    STROKES.put('\u4e00', 1);
    STROKES.put('\u4e8c', 2);
    STROKES.put('\u4e09', 3);
    STROKES.put('\u56db', 5);
    STROKES.put('\u4e94', 4);
    STROKES.put('\u516d', 4);
    STROKES.put('\u4e03', 2);
    STROKES.put('\u516b', 2);
    STROKES.put('\u4e5d', 2);
    STROKES.put('\u5341', 2);
    STROKES.put('\u767e', 6);
    STROKES.put('\u5343', 3);
    STROKES.put('\u4e07', 3);
    STROKES.put('\u5104', 15);
    STROKES.put('\u5146', 6);
    STROKES.put('\u4eac', 8);
    STROKES.put('\u5793', 9);
  }

  private int mN = -1;

  private int strokes(final String chinese) {
    int c = 0;
    for (int k = 0; k < chinese.length(); ++k) {
      c += STROKES.get(chinese.charAt(k));
    }
    return c;
  }

  @Override
  public Z next() {
    return Z.valueOf(strokes(Chinese.SINGLETON.toText(++mN)));
  }
}
